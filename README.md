
## Setup Docker-Compose
https://docs.docker.com/compose/install/

## NorthWind
https://github.com/pthom/northwind_psql

## Windows DockerCompose Issue
在 Window10 可能會遭遇 `docker data directory ... has wrong ownership` 請修改 `docker-compose.yml`
```yaml
# (Windows)存放資料到本地
volumes:
  - ./pgdata:/var/lib/postgresql/pgdata
  - ./northwind.sql:/docker-entrypoint-initdb.d/northwind.sql
```