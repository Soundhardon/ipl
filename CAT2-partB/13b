<?php
function encrypt($Ciphertext, $s)
{
$result = "";
for ($i = 0; $i < strlen($Ciphertext); $i++)
{

if (ctype_upper($Ciphertext[$i]))
$result = $result.chr((ord($Ciphertext[$i]) +$s - 65) % 26 + 65);

else
$result = $result.chr((ord($Ciphertext[$i]) +$s - 97) % 26 + 97);

}

return $result;
}

$Ciphertext = "ABCDE";
$s = 2;
echo "\nText :". $Ciphertext;
echo "\nShift:". $s;
echo "\nCipher:". encrypt($Ciphertext, $s);
?>
