<template>
  <div id="main-div">


    <div id="search">
        <label for="zip">Enter your zip code to find your next dream house</label>
        <input name="zip" type="text" v-model="zipFilter"/>
    </div>    




    <div class="divTable minimalistBlack"  v-if="filteredHomes.length">
        <div class="divTableHeading">
             <div class="divTableRow">
                <div class="divTableHead"></div>
                <div class="divTableHead">MLS Listing NUmber</div>
                 <div class="divTableHead">Address</div>
                <div class="divTableHead">City</div>
                 <div class="divTableHead">State</div>
                  <div class="divTableHead">Zip</div>
                   <div class="divTableHead">Price</div>
            </div>
        </div>
        <div class="divTableBody">
            <div class="divTableRow" v-for="home in filteredHomes" v-bind:key="home.mlsId">
                <div class="divTableCell">
                    <img v-bind:src="home.imageName" />
                </div>
                <div class="divTableCell">{{home.mlsId}}</div>
                <div class="divTableCell">{{home.address}}</div>
                <div class="divTableCell">{{home.city}}</div>
                 <div class="divTableCell">{{home.state}}</div>
                  <div class="divTableCell">{{home.zip}}</div>
                   <div class="divTableCell">$ {{home.price}}</div>
            </div>
        </div>
    </div>
  </div>    
</template>

<script>
export default {
    name: 'home-search',
    data() {
        return {
            zipFilter: ''
        };
    },
    computed: {
        filteredHomes() {
           const homesArray = this.$store.state.homes;
           return homesArray.filter(home => {
              return this.zipFilter === '' ? true : this.zipFilter === home.zip;
           });
        }
    }

}
</script>

<style scoped>

img {
    width: 150px;
    height: auto;
}

#main-div {
    margin: 30px;
}

input[type=text] {
    margin: 30px;
    padding: 12px 20px;
    box-sizing: border-box;
    border: 2px solid green;
    border-radius: 6px;    
}
#search {
    margin: 30px;
}

div.minimalistBlack {
   margin:auto; 
  border: 2px solid #06B712;
  width: 80%;
  text-align: left;
  border-collapse: collapse;
}
.divTable.minimalistBlack .divTableCell, .divTable.minimalistBlack .divTableHead {
  border: 1px solid #000000;
  padding: 5px 4px;
}
.divTable.minimalistBlack .divTableBody .divTableCell {
  font-size: 14px;
}
.divTable.minimalistBlack .divTableHeading {
  background: #1DFF2C;
  background: -moz-linear-gradient(top, #55ff61 0%, #33ff41 66%, #1DFF2C 100%);
  background: -webkit-linear-gradient(top, #55ff61 0%, #33ff41 66%, #1DFF2C 100%);
  background: linear-gradient(to bottom, #55ff61 0%, #33ff41 66%, #1DFF2C 100%);
  border-bottom: 3px solid #0F9A39;
}
.divTable.minimalistBlack .divTableHeading .divTableHead {
  font-size: 15px;
  font-weight: bold;
  color: #109902;
  text-align: left;
}
.minimalistBlack .tableFootStyle {
  font-size: 14px;
}
/* DivTable.com */
.divTable{ 
    display: table; 
    table-layout: fixed;
}
.divTableRow { display: table-row; }
.divTableHeading { display: table-header-group;}
.divTableCell, .divTableHead { display: table-cell;}
.divTableHeading { display: table-header-group;}
.divTableFoot { display: table-footer-group;}
.divTableBody { display: table-row-group;}

</style>