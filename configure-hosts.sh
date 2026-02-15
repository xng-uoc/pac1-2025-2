#!/bin/sh

clab_name="pac1-2025-2"

# Remove the default routes to ensure that routers and hosts are isolated
printf "Removing default routes from routers and hosts..."
sudo docker exec -d clab-$clab_name-vyos01 ip route del default via 172.20.20.1
sudo docker exec -d clab-$clab_name-vyos02 ip route del default via 172.20.20.1
sudo docker exec -d clab-$clab_name-vyos03 ip route del default via 172.20.20.1
sudo docker exec -d clab-$clab_name-host11 ip route del default via 172.20.20.1
sudo docker exec -d clab-$clab_name-host12 ip route del default via 172.20.20.1
sudo docker exec -d clab-$clab_name-host21 ip route del default via 172.20.20.1
sudo docker exec -d clab-$clab_name-host22 ip route del default via 172.20.20.1
sudo docker exec -d clab-$clab_name-host31 ip route del default via 172.20.20.1
sudo docker exec -d clab-$clab_name-host32 ip route del default via 172.20.20.1
printf " done!\n"

# Configure the IP address and default route of hosts
printf "Configuring the IP address and default route of hosts..."
sudo docker exec -d clab-$clab_name-host11 ip link set eth1 up
sudo docker exec -d clab-$clab_name-host12 ip link set eth1 up
sudo docker exec -d clab-$clab_name-host11 ip addr add 192.168.1.11/24 dev eth1
sudo docker exec -d clab-$clab_name-host12 ip addr add 192.168.1.12/24 dev eth1
sudo docker exec -d clab-$clab_name-host11 ip route add default via 192.168.1.1
sudo docker exec -d clab-$clab_name-host12 ip route add default via 192.168.1.1

sudo docker exec -d clab-$clab_name-host21 ip link set eth1 up
sudo docker exec -d clab-$clab_name-host22 ip link set eth1 up
sudo docker exec -d clab-$clab_name-host21 ip addr add 192.168.2.21/24 dev eth1
sudo docker exec -d clab-$clab_name-host22 ip addr add 192.168.2.22/24 dev eth1
sudo docker exec -d clab-$clab_name-host21 ip route add default via 192.168.2.1
sudo docker exec -d clab-$clab_name-host22 ip route add default via 192.168.2.1

sudo docker exec -d clab-$clab_name-host31 ip link set eth1 up
sudo docker exec -d clab-$clab_name-host32 ip link set eth1 up
sudo docker exec -d clab-$clab_name-host31 ip addr add 192.168.3.31/24 dev eth1
sudo docker exec -d clab-$clab_name-host32 ip addr add 192.168.3.32/24 dev eth1
sudo docker exec -d clab-$clab_name-host31 ip route add default via 192.168.3.1
sudo docker exec -d clab-$clab_name-host32 ip route add default via 192.168.3.1
printf " done!\n"
