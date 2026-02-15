#!/bin/bash

clab destroy --topo pac1-2025-2.yml

ip link del name bridge01
ip link del name bridge02
ip link del name bridge03
