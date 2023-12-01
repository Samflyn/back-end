#!/bin/bash

# Define the JSON request body
json_payload='{"firstName": "123", "lastName": "John DÒoe", "phone": 999999}'

# Loop 1000 times
for i in {1..1000}
do
  start_time=$(($(date +%s%N))) # Record start time in milliseconds
  curl -X POST "http://localhost:8080/get-user" \
    -H "Content-Type: application/json" \
    -d "$json_payload"
  end_time=$(($(date +%s%N)))   # Record end time in nanoseconds
  elapsed_time=$(echo "scale=6; ($end_time - $start_time) / 1000000" | bc) # Calculate elapsed time in milliseconds # Calculate elapsed time in milliseconds
  echo "Request $i took $elapsed_time milliseconds"
done