echo enter the string
read string
echo ${string:1:3}
echo ${#string}

length=$((${#string}-1))

echo $length


for ((i=$length;i>=0;i--))
do
rev=$rev${string:$i:1}
done

echo reverse of string $string is $rev

