
                jQuery(document).ready(function($) {

                $.get('/test', function(data) {
                    console.log(data);

                    let table = "<table border='1'>";

                    for (i = 0; i <data.length; i++) {
                    table = table +
                    "<tr><td>" + data[i].id + "</td><td>" + data[i].price + "</td><td>" + data[i].name + "</td></tr>";
                    }

                    table = table + "</table>";

                    $("#myChart").html(table);
                })
            });
