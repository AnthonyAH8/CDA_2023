# Exercice 6

On souhaite cree une imge docker pour distribue notre site web statique via un serveur web

- Choisir une image de serveur web
docker pull nginx

- Cree un dockerfile a partir de cette image qui a la place de sa page par défaut montrera votre projet
FROM nginx

LABEL version="0.1"

WORKDIR /root

COPY . /root

RUN apt-get update && apt-get install -y nano

CMD ["cat", "helloworld.txt"]

EXPOSE 80

# docker cp C:\Users\Administrateur\Desktop\html5up-editorial . myservernginx:/root 

- Vous notere la commande pour teste votre image 

Bonus :

- Vous publierez cette image sur docker hub 