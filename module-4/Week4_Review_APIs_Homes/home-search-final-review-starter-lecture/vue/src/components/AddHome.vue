<template>
  <div id="addHomeform">

   <div class="status-message error" v-show="errorMsg !== ''">{{errorMsg}}</div>
    <form v-on:submit.prevent="submitForm" class="homeForm">
 
      <div class="form-group">
        <label for="mlsNumber">MLS Number:</label>
        <input id="mlsNumber" type="text" class="form-control" v-model="home.mlsNumber" />
      </div>

      <div class="form-group">
        <label for="address">Street Address:</label>
        <input id="address" type="text" class="form-control" v-model="home.address" />
      </div>

      <div class="form-group">
        <label for="city">City:</label>
        <input id="city" type="text" class="form-control" v-model="home.city" />
      </div>

      <div class="form-group">
        <label for="state">State:</label>
        <input id="state" type="text" class="form-control" v-model="home.state" />
      </div>

      <div class="form-group">
        <label for="zip">Zip:</label>
        <input id="zip" type="text" class="form-control" v-model="home.zip" />
      </div>

      <div class="form-group">
        <label for="price">Price:</label>
        <input id="price" type="text" class="form-control" v-model="home.price" />
      </div>

      <div class="form-group">
        <label for="imageName">Image Name (no path needed):</label>
        <input id="imageName" type="text" class="form-control" v-model="home.imageName" />
      </div>

      <button class="btn btn-submit">Submit</button>
      <button v-on:cancel.prevent="cancelForm" class="btn btn-cancel" type="cancel">Cancel</button>
    </form>
  </div>
</template>


<script>

import homeService from '../services/HomeService.js';

export default {
  name: "add-home",

  data() {
    return {
      home: {
        mlsNumber: "",
        address: "",
        city: "",
        state: "",
        zip: "",
        price: "",
        imageName: ""
      },
      errorMsg: ""
    };
  },
  methods: {
     submitForm() {
         console.log('I am here');
    const newHome = {
        mlsNumber: this.home.mlsNumber,
        address: this.home.address,
        city: this.home.city,
        state: this.home.state,
        zip: this.home.zip,
        price: this.home.price,
        imageName: this.home.imageName
      };

      // call our web service
      homeService.addHome(newHome)
         .then(response =>{
             if(response.status === 201) {
                 //successful
                 this.$router.push('search');
             }
         })
         .catch(error => {
                 //error occurred
                this.handleError(error);
         });


     },
     cancelForm() {
          this.$router.push('search');
     },
     handleError(error) {
                 if (error.response) {
                     this.errorMsg = "Error adding a new home. Response received was: " + error.response.statusText + "!";
                 }
                 else if (error.request) {
                     this.errorMsg = "Server unavailable";
                 }
                 else {
                     this.errorMsg = "General Error";
                 }
                 console.log(error.status);
     }
  }

}
 
</script>



<style scoped>
#addHomeform {

  margin-left: auto;
  margin-right: auto;
   width: 500px;

}

form input {
  width: 100%;
}

.homeForm {
  padding: 10px;
  margin-bottom: 10px;
}


.form-group {
  margin-bottom: 10px;
  margin-top: 10px;
}


.form-control {
  display: flex;
  align-items: flex-start;
  width: 100%;
  height: 30px;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  font-weight: 400;
  line-height: 1.5;
  color: #495057;
  border: 1px solid #ced4da;
  border-radius: 0.25rem;
}
textarea.form-control {
  height: 75px;
  font-family: Arial, Helvetica, sans-serif;
}
select.form-control {
  width: 20%;
  display: inline-block;
  margin: 10px 20px 10px 10px;
}
.btn-submit {
  color: #fff;
  padding: 10px 24px;
  background-color: #38b412;
  box-shadow: 0 12px 26px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);  
}

.btn-cancel {
  padding: 10px 24px;
  box-shadow: 0 12px 26px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}

.btn-submit:hover {
  
  color: #fff;
  padding: 10px 24px;
  background-color: #65f307;
  box-shadow: 0 12px 26px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);  
}

.btn-cancel:hover {
  padding: 10px 24px;
  background-color: #65f307;
  box-shadow: 0 12px 26px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}

.status-message {
  display: block;
  border-radius: 5px;
  font-weight: bold;
  font-size: 1rem;
  text-align: center;
  padding: 10px;
  margin-bottom: 10px;
}
.status-message.success {
  background-color: #90ee90;
}
.status-message.error {
  background-color: #f08080;
}
</style>
