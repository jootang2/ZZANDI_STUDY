

//달력
$(".a1").change(function () {
    const val = $(this).val();
    console.log(val);
    $(".a2").attr("min", val);
});


//태그
var input = document.querySelector('input[name=studyTag]')
var tagify = new Tagify(input);

tagify.on('add', function() {
    console.log(tagify.value);
})

//라디오버튼

$(document).ready(function(){

    $('#book').hide();   // 초깃값 설정

    $("input[name='studyType']").change(function(){
        // 휴대폰 결제 선택 시.
        if($("input[name='studyType']:checked").val() == 'Book'){
            $('#book').show();
        }
        // 무통장입금 결제 선택 시.
        else if($("input[name='payment']:checked").val() == '무통장입금'){
            $('#selectPay_card').hide();
            $('#selectPay_phone').hide();
            $('#selectPay_noBank').show();
        }
    });
});