
 echo "enter the number to check"
 read num
 c=0
 for ((i=1;i<=num;i++))
 do
	 if [ $((num % $i)) -eq 0 ]; then
		 c=$((c+1))
	 fi
done	

if [ $c -gt 2 ]; then
	echo "prime"
else
	echo "not prime"
fi
