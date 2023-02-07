$(function () {
      $.ajax({
          type: 'POST',
          url:'/quartreport',
          dataType : 'json',
          success:function (data) {


              let date = [];
              let sum = [];
              for (i = 0; i < data.length; i++) {
                   date.push(data[i].date);
              }
              for (i = 0; i < data.length; i++) {
                    sum.push(data[i].sum);
              }

              var popCanvas = document.getElementById("myChart");

              var barChart = new Chart(popCanvas, {
                  type: 'bar',
                  data: {
                  labels: date,
                  datasets: [{
                  label: '',
                  data: sum,
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
                     'rgb(153, 102, 255)',
                     'rgb(54, 162, 235)'

                  ]
                  }]
                  }
              });

          },
          error:function (jqXHR, textStatus, errorThrown) {
              console.log("error:" + textStatus + " - exception:" + errorThrown)
          }
      });
});