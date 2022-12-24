# rabbitmq-server-spring-boot
rabbitmq-spring-boot

ilk olarak docker desktop üzerinde çalışacak 
bir rabbitmq server  ayağa kaldıralım

docker run --name rabbitMQ -e RABBITMQ_DEFAULT_USER=admin  -e RABBITMQ_DEFAULT_PASS=admin -p 5672:5672 -p 15672:15672  rabbitmq:3-management