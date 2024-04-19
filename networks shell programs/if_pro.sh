#!/bin/bash 
echo "enter the first number"
read num1
echo "enter the second number"
read num2
if [ $num1 -eq $num2 ]; then 
	echo "equal"
else
	echo "not equal"
fi
