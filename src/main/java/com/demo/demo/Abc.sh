#!/bin/bash
curl   -v  http://localhost:5000/getUser |json_pp >> out2.json
response=$(curl -sb -H "Accept: application/json" http://localhost:5000/getUser | json_pp)
##echo $ response

