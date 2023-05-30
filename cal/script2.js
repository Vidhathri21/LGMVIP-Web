let display=document.getElementById("outputscreen");
function allclear(){
    display.value="";
}
function show(){
    display.value+=n;
}
function calc(){
    display.value= eval(display.value);
}