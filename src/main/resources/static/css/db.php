<?php

$host = "/localhost/3306";
$username = "root";
$password = "admin";
$database = "alcodozer2";
$conn = mysqli_connect($host, $username, $password, $database);
print r($conn);
if($conn->connect_error){
    die("Ошибка: " . $conn->connect_error);
}
echo "Подключение успешно установлено";
$conn->close();

$results = $conn->query("SELECT * FROM price");

print_r($results);

?>

<?php while ($db = $results->fetch_assoc()):?>

<tr>
    <td><?php echo $db['price'];?></td>
    <td><?php echo $db['date'];?></td>
</tr>
<?php endwhile;?>