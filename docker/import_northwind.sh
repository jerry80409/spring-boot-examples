#!/usr/bin/env bash
# 匯入 NorthWind 資料庫
docker-compose up
docker-compose exec db psql -U postgres -d test