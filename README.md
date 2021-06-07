# VSOLUTION-REST-API-SPRING-BOOT
 REST API JONATAN - LUIS

# :: Spring Boot ::                (v2.5.0)


# DEPENDENCY
spring-boot-starter-web

spring-boot-starter-data-jpa

mysql-connector-java



# GET ALL VIA CURL RETURN JSON HTTP METHOD-GET

CURL WINDOWS

curl "http://127.0.0.1:8080/empresas/all" -H "User-Agent: Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0" -H "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8" -H "Accept-Language: en-US,en;q=0.5" -H "Connection: keep-alive" -H "Upgrade-Insecure-Requests: 1" -H "Pragma: no-cache" -H "Cache-Control: no-cache"

CURL LINUX

curl 'http://127.0.0.1:8080/empresas/all' -H 'User-Agent: Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0' -H 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8' -H 'Accept-Language: en-US,en;q=0.5' -H 'Connection: keep-alive' -H 'Upgrade-Insecure-Requests: 1' -H 'Pragma: no-cache' -H 'Cache-Control: no-cache'




# GET BY ID VIA CURL TESTS WITH RETURN JSON HTTP METHOD-GET

CURL WINDOWS

curl "http://127.0.0.1:8080/empresas/5" -H "User-Agent: Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0" -H "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8" -H "Accept-Language: en-US,en;q=0.5" -H "Connection: keep-alive" -H "Upgrade-Insecure-Requests: 1" -H "Pragma: no-cache" -H "Cache-Control: no-cache"

CURL LINUX

curl 'http://127.0.0.1:8080/empresas/5' -H 'User-Agent: Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0' -H 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8' -H 'Accept-Language: en-US,en;q=0.5' -H 'Connection: keep-alive' -H 'Upgrade-Insecure-Requests: 1' -H 'Pragma: no-cache' -H 'Cache-Control: no-cache'




# DELETE BY ID VIA CURL HTTP METHOD-DELETE

CURL WINDOWS

curl "http://127.0.0.1:8080/empresas/delete/1" -X DELETE -H "User-Agent: Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0" -H "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8" -H "Accept-Language: en-US,en;q=0.5" -H "Connection: keep-alive" -H "Upgrade-Insecure-Requests: 1" -H "Pragma: no-cache" -H "Cache-Control: no-cache" -H "Origin: http://127.0.0.1:8080"

CURL LINUX

curl 'http://127.0.0.1:8080/empresas/delete/1' -X DELETE -H 'User-Agent: Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0' -H 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8' -H 'Accept-Language: en-US,en;q=0.5' -H 'Connection: keep-alive' -H 'Upgrade-Insecure-Requests: 1' -H 'Pragma: no-cache' -H 'Cache-Control: no-cache' -H 'Origin: http://127.0.0.1:8080'




# UPDATE BY ID VIA CURL HTTP METHOD-PUT

CURL WINDOWS

curl "http://127.0.0.1:8080/empresas/update/2" -X PUT -H "User-Agent: Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0" -H "Accept: */*" -H "Accept-Language: en-US,en;q=0.5" -H "Content-Type: application/json" -H "Origin: null" -H "Connection: keep-alive" -H "Pragma: no-cache" -H "Cache-Control: no-cache" --data-raw "{""cnpj"":""15584135561"",""nome"":""teste ind e com ltda"",""moeda"":""brl real brasileiro"",""cotacao"":""60"",""email"":""teste@teste.com"",""logradouro"":""rua um"",""numero"":""60"",""complemento"":""apto 1 sala 3"",""cep"":""37410045"",""bairro"":""centro"",""cidade"":""tres coracoes""}"

CURL LINUX

curl 'http://127.0.0.1:8080/empresas/update/2' -X PUT -H 'User-Agent: Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0' -H 'Accept: */*' -H 'Accept-Language: en-US,en;q=0.5' -H 'Content-Type: application/json' -H 'Origin: null' -H 'Connection: keep-alive' -H 'Pragma: no-cache' -H 'Cache-Control: no-cache' --data-raw '{"cnpj":"15584135561","nome":"teste ind e com ltda","moeda":"brl real brasileiro","cotacao":"60","email":"teste@teste.com","logradouro":"rua um","numero":"60","complemento":"apto 1 sala 3","cep":"37410045","bairro":"centro","cidade":"tres coracoes"}'


