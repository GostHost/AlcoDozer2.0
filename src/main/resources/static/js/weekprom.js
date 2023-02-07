$(function () {
      $.ajax({
          type: 'POST',
          url:'/weekprom',
          dataType : 'json',
          success:function (data) {


              let date = [];
              let volume = [];

              for (i = 0; i < data.length; i++) {
                   date.push(data[i].date);
              }
              for (i = 0; i < data.length; i++) {
              let clear = (data[i].volume/1000) * data[i].strength * 0.789;
                    volume.push(clear);

              }
              console.log(volume);



              var popCanvas = document.getElementById("myChart");

              var barChart = new Chart(popCanvas, {
                  type: 'bar',
                  data: {
                  labels: date,
                  datasets: [{
                  label: '',
                  data: volume,
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

          },
          error:function (jqXHR, textStatus, errorThrown) {
              console.log("error:" + textStatus + " - exception:" + errorThrown)
          }
      });
});