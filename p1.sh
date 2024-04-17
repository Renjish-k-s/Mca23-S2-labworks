res=0
echo"enter the number"
read num

while [ $num -gt 0 ]
do
        p=$((num%10))
        res=$((res*10+p))
        num=$((num//10))
done    
echo $res
~          
