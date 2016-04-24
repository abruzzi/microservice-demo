$(function() {
    var compiled = _.template($("#staff-template").text());

    var names = $("#names");

    names.keypress(function(event){
        if(event.keyCode == 13) {
            var item = $(this).val();
            fetchAndRender(item);
            $(this).val("").focus();
        }
    });

    function fetchAndRender(names) {
        $.get("/staffs/ugly?names="+names).done(function(staffs) {
            var filtered = staffs.filter(function(staff) {
                return staff != null;
            });

            var container = $("#staffs");
            container.empty().append(compiled({'staffs': filtered}));
        }).fail(function(error) {
            console.log(error);
        });
    }
});