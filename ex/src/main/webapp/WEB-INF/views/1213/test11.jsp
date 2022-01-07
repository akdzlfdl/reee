<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    
<script type="text/javascript">
$(function(){
   $("th:nth-child(odd)").addClass("odd");
   $("tr:nth-child(even)").addClass("even");
});
      </script>
      <style type="text/css">
      table{
         margin:100px auto;
      }
      .odd{
         background:#444444;
      }
      th{
         background:#222222;
         color:white;
      }
      th,td{
         padding:5px;
         font-size:small;
      }
      .even{
         background:#F2F2F2;
      }

      </style>
   </head>
   <body>
      <table>
         <tr>
            <th>no</th><th>DepCode</th><th>DepName</th><th>Tel</th><th>Bigo</th>
         </tr>
         <tr>
            <td>1</td><td>T0001</td><td>Management</td><td>1234-5678</td><td>15</td>
         </tr>
         <tr>
            <td>2</td><td>T0002</td><td>Service</td><td>9999-9999</td><td>5</td>
         </tr>
         <tr>
            <td>3</td><td>T0003</td><td>Design</td><td>9876-5432</td><td>11</td>
         </tr>
         <tr>
            <td>4</td><td>T0004</td><td>App</td><td>0234-5678</td><td>7</td>
         </tr>
         <tr>
            <td>5</td><td>T0005</td><td>Platform</td><td>9999-7777</td><td>22</td>
         </tr>,
         <tr>
            <td>6</td><td>T0006</td><td>WebDev</td><td>0904-5678</td><td>10</td>
         </tr>
         <tr>
            <td>7</td><td>T0007</td><td>Cloud</td><td>9876-5432</td><td>30</td>
         </tr>
         <tr>
            <td>8</td><td>T0008</td><td>Market</td><td>0999-7777</td><td>8</td>
         </tr>
      </table>
   </body>