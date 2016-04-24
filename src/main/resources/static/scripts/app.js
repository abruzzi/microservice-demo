$(function() {
    var compiled = _.template($("#staff-template").text());
    $("#search").on('click', function() {
        var names = $("#names").val();
        $.get("/staffs/ugly?names="+names).done(function(staffs) {
            var filtered = staffs.filter(function(staff) {
                return staff != null;
            });

            var container = $("#staffs");
            container.empty().append(compiled({'staffs': filtered}));
        }).fail(function(error) {
            console.log(error);
        });
    });

});