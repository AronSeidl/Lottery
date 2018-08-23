/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function () {
    $("#generatewinners").click(function () {
        $.get('/rest/todos', function (winnerTicketsDto) {
            for (var i = 1; i < winnerTicketsDto.length; i++) {
                for (var i = 0; i < winnerTicketsDto[i].length; i++) {
                    var $name = $('<td></td>').text(winnerTicketsDto[i].name);
                    var $firstNumber = $('<td></td>').text(winnerTicketsDto[i].playedNumbers[0]);
                    var $secondNumber = $('<td></td>').text(winnerTicketsDto[i].playedNumbers[1]);
                    var $thirdNumber = $('<td></td>').text(winnerTicketsDto[i].playedNumbers[2]);
                    var $fourthNumber = $('<td></td>').text(winnerTicketsDto[i].playedNumbers[3]);
                    var $fifthNumbervar = $('<td></td>').text(winnerTicketsDto[i].playedNumbers[4]);
                }
                var $tr = $('<tr></tr>').append($name).append($firstNumber).append($secondNumber).append($thirdNumber).append($fourthNumber).append($fifthNumbervar);
                switch (i) {
                    case 0:
                        $('#tabfive').append($tr);
                        break;
                    case 1:
                        $('#tabfour').append($tr);
                        break;
                    case 2:
                        $('#tabthree').append($tr);
                        break;
                    case 3:
                        $('#tabtwo').append($tr);
                        break;

                }
            }
        });
    });
});