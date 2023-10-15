function turnOn()
{
    var x=document.getElementById("values")
    x.style.visibility="visible"
}
function turnOff()
{
    var x=document.getElementById("values")
    x.style.visibility="hidden"
}

function getValues(num){
    var x=document.getElementById("values")
    x.value=x.value+num
}

function clearOne(){
    var x=document.getElementById("values")
    x.value=x.value.slice(0,-1)
}
function clearAll(){
    var x=document.getElementById("values")
    x.value=""
}


function calculate(){
    try {
       var x=document.getElementById("values")
       x.value=eval(x.value) 
    } catch (error) {
        x.value=x.value.innerHtml="error"
        
    }
}