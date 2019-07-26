Feature: Registration
Scenario: validation for reg

Given open browser

And enter username "susan"
And enter firstname "susan"
And enter lastname "rekha"
And enter password "qwerty"
And Enter confirm password "qwerty"
And Enter gender female
And  enter email "rekha@gmail.com"
And mobile number "1234567890"
And DOB "13/03/1998"
And Address "abc"
And choose security question
Then type "blue"