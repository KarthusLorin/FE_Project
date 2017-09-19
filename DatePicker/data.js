(function(){

    var datepicker = {};

    datepicker.getMonthData = function(year, month){

        var ret = [];
        
        if(!year || !month){
            var today = new Date();
            year = today.getFullYear();
            month = today.getMonth() + 1;
        }

        var firstDay = new Date(year, month - 1, 1);

    };

    window.datepicker = datepicker;

})();