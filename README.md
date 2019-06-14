## Web 

## I. Web 개념



### DNS  (Gate Way 를 통해서 나감)

- Domain name server.
  - 요청한 url 의 ip address를 알려줌. 



## Web programming

content root ( web app name )

content directiory(web html root)





## II. expression

## 		- HTML 4 ~

- \&nbsp; - 공백 문자 

- \<h1> -> 하나의 블럭을 차지함

- \<a > 자기 자리만을 차지함 

-  \<i> 이태릭체, \<strong> 진하게, \<br> 엔터 

  ```html
  <h1>
      h1~ h5 단계별로 단락 문장
  </h1>
  <i> 이태릭체 </i>
  <strong> 굵은 글씨체</strong>
  <br> 엔터
  ```

  

  

   

- \<form> 을 이용해 text, password 등을 만들어서 전송이 가능함 

  ````html
  <form>
      ID <input type= "text" name = "nm"><br>
      <input type = "submit" value ="LOGIN">
      <ipnut type = "reset" value = "RESET">
          
  	TEXT <input type ="text" name="tx"><br>
  	PASSWORD <input type="password" name="pwd"><br>
  
  </form>
  ````

  - Radio Button - 여러개중 하나 선택가능
  - Checkbox - 복수선택 가능
  - Select - 골라서 선택가능
  - File - 파일 선택가능
  - Button ( Sumbit Button - 제출전용 버튼)

  ```html
  <form>
   	Apple<input type ="checkbox" name="f" value="a">
  	Banana<input type="checkbox" name="f" value="b">
         
  	Radio1 <input type="radio" name="g" value="m1">
  	Radio2 <input type="radio" name="g" value="m2">
  
  	<select name="car">
  	<option value="h">Hyndai</option>
  	<option value="k">Kia</option>
  	<option vlaue="s">SSang</option>
      </select>
  
  	File <input type="file" name="ff">
      
  </form>
  ```

  - Fieldset- 필드를 한정함
  - legend- 필드외곽선을 만들어줌

  ```html
  <fieldset>
  <legend>
      This is legend 
  </legend>
  </fieldset>
  ```

  

  

  - label - id에 라벨을 만들어줌

    ```html
    <label for="male">Male</label>
    <input id="male" type="radio"name="g" value="a"
    ```

  - hidden - 웹에선 보이지 않지만 서버로 전송되는 정보 

    ```html
    <input type="hidden" name="geo" value="fff"
    ```

## - HTML 5

- 자동완성, 추천등  성능 개선



DATE <input type="date" name="d"><br>
COLOR<input type="color" name="c"><br>
EMAIL<input type="email" name="e"><br>
TEL<input type="tel" 

pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}'
title="###-####-####"



name="t" required="required">



<br>
NUMBER<input type="number" name="n"><br>
RANGE<input type="range" min="1" max="10" name="range"><br>

<input type="submit" value="REGISTER">











## III. CSS

- 같은 구문이 있으면 마지막 설정이 적용이 됨. 

- <https://www.w3schools.com/cssref/> css reference 

- <https://www.highcharts.com/>  차트 css 제공 

- CSS 파일을 만들어서 작성한 후 html에서 link

- https://www.fonts.google.com 폰트 제공

  ```html
  <link type="text/css" rel="stylesheet" href="a.css"
  ```

  

a{} : a태그들 설정

\*{} -> 전체 설정

#a{} => a id 설정

.a{} : a클래스들 설정

```html
<style>
    a{
        color:red;
        font-size: 2em;
    }
    *{
        color:blue;
    }
    #a{
        color:black;
    }
    .a{
        color:blakc;
        
    }
</style>
```

a:hover -> a에 마우스를 대는 순간 적용

a:nth-child(2n) -> 짝수번째 a에만 적용



text-align: text의 위치 적용

font-familly : '이것 사용', 없으면 이것 사용;

line-height : 공백을 만들어서 높이를 키운다. 

(center 를 맞출 때 공백을 이용해야 할 필요가 있음. )

```css
h3{
   	text-align:center;
    font-familly : 'Sigmar One', cursive;
    font-size : 150%
    line-height: 100px;
    border:1px solid black;
}
```

margin : 바깥쪽 여백 사이즈 ( 50px 0 100px 20px )-> 상 좌 하 우 

padding : 안쪽 여백 사이즈 (너무 크게 하면 바깥까지 변형될수도)

display :block  -> block내부에 block으로 맞춤. 