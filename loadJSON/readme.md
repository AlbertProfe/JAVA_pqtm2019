# Welcome to loadJSON

previous:

## TMB

https://developer.tmb.cat/api-docs/v1

KEYS
<your_app_id>		3bee4085
<your_app_key>	4e905f6dae559e8e2d4eb49586a331d5

APIS
https://api.tmb.cat/v1/transit/parades?app_id=<your_app_id>&app_key=<your_app_key>
https://api.tmb.cat/v1/transit/parades?app_id=3bee4085&app_key=4e905f6dae559e8e2d4eb49586a331d5
https://api.tmb.cat/v1/ibus/stops/2775?app_id=3bee4085&app_key=4e905f6dae559e8e2d4eb49586a331d5



output
https://api.tmb.cat/v1/ibus/stops/2775?app_id=3bee4085&app_key=4e905f6dae559e8e2d4eb49586a331d5

{"status":"success","data":{"ibus":[{"routeId":"0230","line":"23","text-ca":"4 min","t-in-s":299,"destination":"Parc Logístic","t-in-min":4}]}}

https://api.tmb.cat/v1/transit/parades?app_id=3bee4085&app_key=4e905f6dae559e8e2d4eb49586a331d5


## OPEN DATA BCN



https://opendata-ajuntament.barcelona.cat/
https://opendata-ajuntament.barcelona.cat/data/es/dataset/punts-wifi/resource/ee5c6a24-7cb1-4897-9793-57de0d047d8b

 
El API de Datos es accesible a través de las siguientes acciones de la API de acción de CKAN.
Crear
https://opendata-ajuntament.barcelona.cat/data/api/action/datastore_create
Actualizar / Insertar
https://opendata-ajuntament.barcelona.cat/data/api/action/datastore_upsert
Consulta
https://opendata-ajuntament.barcelona.cat/data/api/action/datastore_search
https://opendata-ajuntament.barcelona.cat/data/api/action/datastore_search_sql


Ejemplo de consulta (primeros cinco resultados)
https://opendata-ajuntament.barcelona.cat/data/api/action/datastore_search?resource_id=ee5c6a24-7cb1-4897-9793-57de0d047d8b&limit=5
Consulta ejemplo (resultados que contienen 'jones')
https://opendata-ajuntament.barcelona.cat/data/api/action/datastore_search?resource_id=ee5c6a24-7cb1-4897-9793-57de0d047d8b&q=jones
Consulta ejemplo (vía sentencia SQL)
https://opendata-ajuntament.barcelona.cat/data/api/action/datastore_search_sql?sql=SELECT * from "ee5c6a24-7cb1-4897-9793-57de0d047d8b" WHERE title LIKE 'jones'

## JSON VIEWER
 
http://jsonviewer.stack.hu/


