#!/usr/bin/env bash

Architerture=$(uname -a)
CPU_ph=$(grep "physical id" /proc/cpuinfo | sort | uniq | wc -l)
vCPU=$(grep "^processor" /proc/cpuinfo | wc -l)
mem_total=$(free --mega | awk '$1 == "Mem" {print $2}')
mem_used=$(free --mega | awk '$1 == "Mem" {print $3}')
mem_ratio=${free | grep Mem | awk '{printf ("%.2f%", $3/$2 * 100.0)}'}