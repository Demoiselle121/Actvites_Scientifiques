<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>New user</title>
<link rel="stylesheet" href="css_registration/style.css">
<script src="https://kit.fontawesome.com/a076d05399.js"></script>

</head>
  <body>
  
    <div class="container">
      <header>Signup Form</header>
      
      <div class="progress-bar">
        <div class="step">
          <p>Name</p>
          <div class="bullet">
            <span>1</span>
          </div>
          <div class="check fas fa-check"></div>
        </div>
        <div class="step">
          <p>Contact</p>
          <div class="bullet">
            <span>2</span>
          </div>
          <div class="check fas fa-check"></div>
        </div>
        <div class="step">
          <p>Profil</p>
          <div class="bullet">
            <span>3</span>
          </div>
          <div class="check fas fa-check"></div>
        </div>
        <div class="step">
          <p>Submit</p>
          <div class="bullet">
            <span>4</span>
          </div>
          <div class="check fas fa-check"></div>
        </div>
      </div>
      
      
      
      <div class="form-outer">
        <form action ="registration.php" method="post" enctype ="multipart/form-data">
          <div class="page slide-page">
            <div class="title">Basic Info:</div>
            <div class="field">
              <div class="label">Nom</div>
              <input type="text" name ="nom_chercheur" required>
            </div>
            <div class="field">
              <div class="label">Prenom</div>
              <input type="text" name ="prenom_chercheur" required>
            </div>
            <div>
            <input type="file" id="myFile" name="photo_chercheur">
            </div>
            
        <div class="field">
              <button class="firstNext next">Next</button>
            </div>
          </div>
                        
                 
           

          <div class="page">
            <div class="title">Contact Info:</div>
            <div class="field">
           <p style="color:red;"><c:out value="${msg1}"/></p>
              <div class="label">Email Address</div>
              <input type="email" name ="email_chercheur" required>
            </div>
            <div class="field">
              <div class="label">Phone Number</div>
              <input type="Number" name ="tel_chercheur">
            </div>
            <div class="field btns">
              <button class="prev-1 prev">Previous</button>
              <button class="next-1 next">Next</button>
            </div>
          </div>

          <div class="page">
            <div class="title">Profil</div>
            <div class="field">
            <label for="type_chercheur">Vous etes ? </label>

			<select name="type_chercheur" id="type_chercheur" required>
  				<option value="Professeur">Professeur</option>
  				<option value="Docteur">Docteur</option>
  				<option value="Doctorant">Doctorant</option>
			</select>
			</div>
			
            <div class="field">
              <div class="label">Responsabilté</div>
              <input type="text" name ="responsablite_chercheur">
            </div>
             <div class="field">
              <div class="label">Responsabilté pédagoqique</div>
              <input type="text" name ="responsabilite_pedagogique_chercheur">
            </div>
            <div class="field btns">
              <button class="prev-2 prev">Previous</button>
              <button class="next-2 next">Next</button>
            </div>
          </div>

          <div class="page">
            <div class="title">Login Details:</div>
            <div class="field">
              
            </div>
            <div class="field">
              <div class="label">Username</div>
              <input type="text" name ="nom_chercheur" required>
            </div>
            <div class="field">
              <div class="label">Password</div>
              <input type="password" name ="mdp" required>
            </div>
            
            <div class="field btns">
              <button class="prev-3 prev">Previous</button>
              <button class="submit">Submit</button>
            </div>
          </div>
        </form>
      </div>
    </div>
   
  </body>
  <script src="js_registration/script.js"></script>
</html>
