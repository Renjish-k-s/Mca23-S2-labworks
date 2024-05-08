echo enter the limit 
read limit
a=0
b=1
echo -n $a
for((i=0;i<limit;i++))
do
echo -n $b
next=$(($a+$b))
a=$b
b=$next
done


