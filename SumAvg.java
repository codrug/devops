public class SumAvg {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 10; i++) sum += i;
    System.out.println("Sum = " + sum);
    System.out.println("Average = " + (sum / 10.0));
  }
}





























/*
Step 1: Create directory and add file.
o $ mkdir myloginDemo
o $ cd myloginDemo
o vi login.html
<html>
<head>
<title> Login Page</title>
<script language="javascript">
function validate()
{
var u=document.f1.u.value;
var p=document.f1.p.value;
if(u=="MVSREC" && p=="ITD")
{
window.open("loginsuccess.html");
}
else
{
window.open("loginfail.html");
}
}
</script>
</head>
<body>
<form name="f1">
<h1 align="center" style="color:blue">Login Page</h1>
<table align="center" bgcolor="pink">
<tr>
<td>UserId</td>
<td><input type="text" name="u" id="un"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="p" id="pw"></td>
</tr>
<tr>
<td><input type="button" value="Signin" id="s"
onclick="validate()"></td>
<td><input type="reset" value="Reset id="r"></td>
</tr>
</table>
</form>
</body>
</html>
o vi loginsucess.html
<html>
<head>
<title> Success </title>
</head>
<body>
<h1 align="center" style="color:red"> Login Succeess</h1>
</body>
</html>

o vi loginfail.html
<html>
<head>
<title> Fail </title>
</head>
<body>
<h1 align="center" style="color:red"> Login Failed</h1>
</body>
</html>

o vi mylogin.js
const { Builder, By, until } = require("selenium-webdriver");
const assert = require("assert");
async function loginTest() {
// launch the browser
let driver = await new Builder().forBrowser("chrome").build();
try {
await driver.get("file:///home/mvsr/myloginDemo/login.html");
await driver.findElement(By.id("un")).sendKeys("MVSREC");
await driver.findElement(By.id("pw")).sendKeys("ITD");
await driver.findElement(By.id("s")).click();
const title = await driver.getTitle();
assert.strictEqual(title,"Login Page");
console.log("success");
} finally {
await driver.quit();
}
}
loginTest();

Step 2: Initialize the project and execute it
Execution Steps for Selenium:
• node -v
// check whether node is installed. If not, install using below commands.
// sudo apt-get update
//sudo apt install nodejs
• npm -v
// check whether npm is installed. If not, install using below commands.
//sudo apt install npm
• npm init // Initilaze the node package
• npm install selenium-webdriver // add selenium web driver as dependency
• npm init //check out for addition of selenium dependency
• node mylogin.js //execute the program
*/
