# Exercício JWT - Quarkus

Exercício para criar um token JWT e fazer a propagação do mesmo (com https), utilizando o Quarkus.

Exercício pode ser encontrato em: https://pw2.rpmhub.dev/topicos/jwt/jwt.html


# Diretórios
Cada diretório (backend, bff e users) é um webservice.


# Users
Responsável por criar o token JWT.


# Backend
Responsável por fazer a soma de dois valores que vem por GET.


# Bff
Responsável por fazer a intermediação do front-end com o back-end, ou seja, faz a requisição para o webservice 'Backend', propagando o token JWT.