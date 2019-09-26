# Welcome to loadJSON

previous:

## TMB

https://developer.tmb.cat/api-docs/v1

KEYS
<your_app_id>		3bee4085
<your_app_key>	4e905f6dae559e8e2d4eb49586a331d5

APIS
**Without keys:** https://api.tmb.cat/v1/transit/parades?app_id=<your_app_id>&app_key=<your_app_key>

**With keys parades:** https://api.tmb.cat/v1/transit/parades?app_id=3bee4085&app_key=4e905f6dae559e8e2d4eb49586a331d5

**With keys temps una linea:** https://api.tmb.cat/v1/ibus/stops/2775?app_id=3bee4085&app_key=4e905f6dae559e8e2d4eb49586a331d5




![API rest TMB](https://github.com/AlbertProfe/JAVA_pqtm2019/blob/master/loadJSON/transit-model.png)


output
https://api.tmb.cat/v1/ibus/stops/2775?app_id=3bee4085&app_key=4e905f6dae559e8e2d4eb49586a331d5

{"status":"success","data":{"ibus":[{"routeId":"0230","line":"23","text-ca":"4 min","t-in-s":299,"destination":"Parc Logístic","t-in-min":4}]}}
...


https://api.tmb.cat/v1/transit/parades?app_id=3bee4085&app_key=4e905f6dae559e8e2d4eb49586a331d5

{"type":"FeatureCollection","features":[{"type":"Feature","id":"PARADES_ACTIVES.680249","geometry":{"type":"Point","coordinates":[2.198985,41.393104]},"geometry_name":"GEOMETRY","properties":{"ID_PARADA":680249,"CODI_PARADA":2,"NOM_PARADA":"Av Icària - Àlaba","DESC_PARADA":"Av. Icària/Frederic Mompou","CODI_INTERC":0,"NOM_INTERC":null,"NOM_TIPUS_PARADA":"NOU4MS","NOM_TIPUS_SIMPLE_PARADA":"Marquesina ","DESC_TIPUS_PARADA":"Nova Marq. Pal·li Simple","TIPIFICACIO_PARADA":"NXB","ADRECA":"Av. Icària, 193","ID_POBLACIO":748,"NOM_POBLACIO":"Barcelona","ID_DISTRICTE":621,"NOM_DISTRICTE":"Sant Martí","DATA":"2019-09-25Z","NOM_VIA":"Avinguda d'Icària","NOM_PROPERA_VIA":"Carrer de Frederic Mompou"}},{"type":"Feature","id":"PARADES_ACTIVES.689727","geometry":{"type":"Point","coordinates":[2.196311,41.390423]},"geometry_name":"GEOMETRY","properties":{"ID_PARADA":689727,"CODI_PARADA":698,"NOM_PARADA":"Av Icària - Joan Miró","DESC_PARADA":"Icària/Rosa Sensat","CODI_INTERC":38,"NOM_INTERC":"Icària","NOM_TIPUS_PARADA":"NOU4MS","NOM_TIPUS_SIMPLE_PARADA":"Marquesina ","DESC_TIPUS_PARADA":"Nova Marq. Pal·li Simple","TIPIFICACIO_PARADA":"NXB","ADRECA":"Av. Icària, 142-150","ID_POBLACIO":748,"NOM_POBLACIO":"Barcelona","ID_DISTRICTE":621,"NOM_DISTRICTE":"Sant Martí","DATA":"2019-
...



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


## GOOGLE
 
api:				https://sheets.googleapis.com/v4/spreadsheets/{sheet_id}/values/Sheet1!A1:D5?key={YOUR_API_KEY}
	
1. keyuser (albertprofe):	**AIzaSyB6KLXPqUPIAB05O4r4C8goHZx3e3dAYKc**
2. domain:			**https://sheets.googleapis.com**
3. sheet id:			**1QQnJadZm5iwF2aBqy5ByllxV-WIH9Wf-7D4wmtzibsk**	
4. query your SHEET (1):	**/v4/spreadsheets/{spreadsheetId}**
5. query your SHEET (2):	**values/Sheet1!A1:D5**
6. API GET:			**https://sheets.googleapis.com/v4/spreadsheets/1QQnJadZm5iwF2aBqy5ByllxV-WIH9Wf-7D4wmtzibsk/values/dades!A1:g44**	
7. query your KEY:		**?key={YOUR_API_KEY}**
8. API GET FINAL:		**https://sheets.googleapis.com/v4/spreadsheets/1QQnJadZm5iwF2aBqy5ByllxV-WIH9Wf-7D4wmtzibsk/values/dades!A1:g44?key=AIzaSyB6KLXPqUPIAB05O4r4C8goHZx3e3dAYKc**
	
	
## BACKENDLESS

https://api.backendless.com/B9F8A799-6738-90EC-FFAA-222A5E74B000/B6CDEBD0-0F91-7EAE-FF90-FF74F1410F00/data/dades
