sum=0
echo "enter the limit"
read l
for ((i=0;i<=l;i++))
do
	sum=$((sum+i))
done
echo $sum
