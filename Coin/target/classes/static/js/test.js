/* common(공통) js 함수 파일 */


/* ajax submit */

function submitAjax() {
    var args = arguments;
    var frm = args[0] != null ? args[0] : null;
    var url = args[1] != null ? args[1] : null;
    var callbackFunc = args[2];


    $(frm).ajaxSubmit({
        url : url
        , type : 'post'
        , success : function(data) {

        }
    });
}