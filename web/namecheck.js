/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validate(){
    var fullname=document.getElementById('full-name').value;
    var luser= /^[a-zA-Z]+(?:\s[a-zA-Z]+)+$/;
    var nameresult=luser.text(fullname);
    var myInput = document.getElementById("pass");
   var letter = document.getElementById("letter");
   var capital = document.getElementById("capital");
   var number = document.getElementById("number");
   myInput.onfocus = function() {
      document.getElementById("checksField").style.display = "block";
   };
   myInput.onblur = function() {
      document.getElementById("checksField").style.display = "none";
   };
   myInput.onkeyup = function() {
      var lowerCaseLetters = /[a-z]/g;
      if (myInput.value.match(lowerCaseLetters)) {
         letter.classList.remove("wrong");
         letter.classList.add("correct");
      } else {
         letter.classList.remove("correct");
         letter.classList.add("wrong");
      }
      var upperCaseLetters = /[A-Z]/g;
      if (myInput.value.match(upperCaseLetters)) {
         capital.classList.remove("wrong");
         capital.classList.add("correct");
      } else {
         capital.classList.remove("correct");
         capital.classList.add("wrong");
      }
      var numbers = /[0-9]/g;
      if (myInput.value.match(numbers)) {
         number.classList.remove("wrong");
         number.classList.add("correct");
      } else {
         number.classList.remove("correct");
         number.classList.add("wrong");
      }
   };
    if(nameresult==false)
    {
      document.getElementById('full-name').style.background-color ="red";
  document.getElementById('m7').innerHTML="Please enter a valid Name";
  return false;
        }  
   

