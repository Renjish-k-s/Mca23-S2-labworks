echo enter the number
read num
sum=0
while [ $num -gt 0 ]
do 
    p=$((num%10))
    sum=$((sum+p))
    num=$((num/10))
    if [ $sum -gt 9 ] && [ $num -eq 0 ]
    then
    num=$sum
    sum=0
    fi
done

echo $sum