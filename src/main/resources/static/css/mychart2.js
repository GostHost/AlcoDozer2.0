

 jQuery(document).ready(function($) {
                let date = [];
                let price = [];

                $.get('/testing', function(data) {
                console.log xhr
                console.log(data)

                                    for (i = 0; i < 5; i++) {
                                    date = data[i].date;
                                    price = data[i].price;
                                    }



            var popCanvas = document.getElementById("myChart");

            var barChart = new Chart(popCanvas, {
              type: 'bar',
              data: {
                labels: date,
                datasets: [{
                  label: 'Траты',
                  data: price,
                  backgroundColor: [
                    'rgb(255, 99, 132)',
                    'rgb(54, 162, 235)',
                    'rgb(255, 206, 86)',
                    'rgb(75, 192, 192)',
                    'rgb(153, 102, 255)',
                    'rgb(255, 159, 64)',
                    'rgb(255, 99, 132)',
                    'rgb(54, 162, 235)',
                    'rgb(255, 206, 86)',
                    'rgb(75, 192, 192)',
                    'rgb(153, 102, 255)'
                  ]
                }]
              }
            });



            })
 });

