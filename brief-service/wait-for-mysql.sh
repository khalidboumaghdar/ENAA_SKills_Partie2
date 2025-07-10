#!/bin/bash
set -e

host="$1"
user="$2"
password="$3"
shift 3

echo "Waiting for MySQL to be ready at $host..."

until mariadb-admin ping -h"$host" -u"$user" -p"$password" --silent; do
  echo "MySQL is not ready yet. Retrying in 2s..."
  sleep 2
done

echo "MySQL is ready! Starting application..."
exec "$@"