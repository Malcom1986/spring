start-db:
	docker run -t -e POSTGRES_PASSWORD=qwerty -e POSTGRES_USER=malcom -p 5432:5432 -d -v ~/postgres-data:/var/lib/postgresql/data postgres
