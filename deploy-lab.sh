#!/bin/bash

# Create network bridges
printf "Creating network bridges... "
ip link add name bridge01 type bridge
ip link set dev bridge01 up
ip link add name bridge02 type bridge
ip link set dev bridge02 up
ip link add name bridge03 type bridge
ip link set dev bridge03 up
printf " done!\n"

clab deploy --topo pac1-2025-2.yml

./configure-hosts.sh
