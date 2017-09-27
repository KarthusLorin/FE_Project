(function($){
    var privateFun = function(){
        //私有方法
    }
    var PageSwitch = (function(){
        function PageSwitch(element, options){
            this.settins = $.extend(true, $.fn.PageSwitch.default, options||{});
            this.element = element;
            this.init();
        }
        PageSwitch.prototype = {
            init: function(){

            }
        }
        return PageSwitch;
    })()

    $.fn.PageSwitch = function(options){
        
        return this.each(function(){
            var me = $(this),
                instance = me.data("PageSwitch");
            if(!instance){
                instance = new PageSwitch(me, options);
                me.data("PageSwitch", instance);
            }
            if($.type(options) === "string") return instance[options]();
        })

    }

    $.fn.PageSwitch.default = {
        selectors: {
            sections: ".sections",
            section: ".sectioin",
            page: ".pages",
            active: ".active"
        },
        index: 0,
        easing: "ease",
        duration: 500,
        loop: false,
        pagination: true,
        keyboard:true,
        direction: "vertical",
        callback: ""
    }

    $(function(){
        $("[data-PageSwitch]").PageSwitch();
    })

})(jQuery);