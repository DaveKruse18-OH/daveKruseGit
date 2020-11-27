<template>
  <div class="container">
    <table id="tblUsers">
      <thead>
        <tr>
          <th>&nbsp;</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Username</th>
          <th>Email Address</th>
          <th>Status</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>
            <input type="checkbox" id="selectAll" />
          </td>
          <td>
            <input type="text" id="firstNameFilter" v-model="filter.firstName" />
          </td>
          <td>
            <input type="text" id="lastNameFilter" v-model="filter.lastName" />
          </td>
          <td>
            <input type="text" id="usernameFilter" v-model="filter.username" />
          </td>
          <td>
            <input type="text" id="emailFilter" v-model="filter.emailAddress" />
          </td>
          <td>
            <select id="statusFilter" v-model="filter.status">
              <option value>Show All</option>
              <option value="Active">Active</option>
              <option value="Disabled">Disabled</option>
            </select>
          </td>
          <td>&nbsp;</td>
        </tr>
        <!-- This is it (below). -->
        <tr
          v-for="user in filteredList"
          v-bind:key="user.id"
          v-bind:class="{ disabled: user.status === 'Disabled' }">
          <td>
            <input type="checkbox" v-bind:id="user.id"
              v-model="myCheckBox"
              v-on:click.stop="toggleCheckBox(user.id)"/>
          </td>
          <td>{{ user.firstName }}</td>
          <td>{{ user.lastName }}</td>
          <td>{{ user.username }}</td>
          <td>{{ user.emailAddress }}</td>
          <td>{{ user.status }}</td>
          <td>
            <button class="btnEnableDisable" v-on:click.prevent="flipStatus(user.id)" v-if="user.status == 'Active'">Disable</button>
            <button class="btnEnableDisable" v-on:click.prevent="flipStatus(user.id)" v-if="user.status == 'Disabled'">Enable</button>
          </td>
        </tr>
      </tbody>
    </table>

    <div class="all-actions">
      <button v-bind:disabled=actionButtonsDisabled v-on:click.prevent="enableUsers()">Enable Users</button>
      <button v-bind:disabled=actionButtonsDisabled v-on:click.prevent="disableUsers()">Disable Users</button>
      <button v-bind:disabled=actionButtonsDisabled v-on:click.prevent="deleteUsers()">Delete Users</button>
    </div>


    <!--
    <a
      id="show-form-button"
      href="#"
      v-on:click.prevent="showForm = true"
      v-if="showForm === false"
      >Show Form
    </a>-->

    <!--
    <button
      id="add-new-user"
      v-on:click.prevent="showForm = true"
      v-if="showForm === false"
      >Add New User
    </button>
    -->
    <button
      id="add-new-user"
      v-on:click.prevent="showForm = true"
      v-on:dblclick.prevent="showForm = false"
    >Add User
    </button>

    <form id="frmAddNewUser" v-on:submit.prevent="addNewUser()" v-if="showForm === true">
      <div class="field">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" v-model="newUser.firstName"/>
      </div>
      <div class="field">
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" v-model="newUser.lastName"/>
      </div>
      <div class="field">
        <label for="username">Username:</label>
        <input type="text" name="username" v-model="newUser.username"/>
      </div>
      <div class="field">
        <label for="emailAddress">Email Address:</label>
        <input type="text" name="emailAddress" v-model="newUser.emailAddress"/>
      </div>
      <button type="submit" class="btn save">Save User</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "user-list",
  data() {
    return {
      filter: {
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: ""
      },
      newUser: {
        id: null,
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Active"
      },
      selectedUserIds: [1, 3, 5],
      showActionButtons: false,
      myCheckBox: false,
      users: [
        {
          id: 1,
          firstName: "John",
          lastName: "Smith",
          username: "jsmith",
          emailAddress: "jsmith@gmail.com",
          status: "Active"
        },
        {
          id: 2,
          firstName: "Anna",
          lastName: "Bell",
          username: "abell",
          emailAddress: "abell@yahoo.com",
          status: "Active"
        },
        {
          id: 3,
          firstName: "George",
          lastName: "Best",
          username: "gbest",
          emailAddress: "gbest@gmail.com",
          status: "Disabled"
        },
        {
          id: 4,
          firstName: "Ben",
          lastName: "Carter",
          username: "bcarter",
          emailAddress: "bcarter@gmail.com",
          status: "Active"
        },
        {
          id: 5,
          firstName: "Katie",
          lastName: "Jackson",
          username: "kjackson",
          emailAddress: "kjackson@yahoo.com",
          status: "Active"
        },
        {
          id: 6,
          firstName: "Mark",
          lastName: "Smith",
          username: "msmith",
          emailAddress: "msmith@foo.com",
          status: "Disabled"
        }
      ],
      showForm: false,
    };
  },
  methods: {
    addNewUser() {
      this.newUser.id = this.users.length + 1;
      this.users.unshift(this.newUser);
      this.resetForm();
    },
    resetForm() {
      this.newUser = {};
      this.showForm = false;
    },
    flipStatus(idToMatch) {
      this.users.forEach((user) => {
        if (user.id == idToMatch) {
          if (user.status == 'Active') {
            user.status = 'Disabled';
          } else {
            user.status = 'Active';
          }
        }
      });
      console.log(idToMatch);
    },
    toggleCheckBox(id) {
      this.selectedUserIds.unshift(id);
      this.myCheckBox = true;
      console.log(id);
    },
    enableUsers() {
      for (let x = 0; x < this.selectedUserIds.length; x++) {
        let idToMatch = this.selectedUserIds[x];
        this.users.forEach((user) => {
          if (user.id == idToMatch) {
            user.status = 'Active';
          }
        });
      }
      // Empty selectedUserIds[] array.
      for (let x = 0; x < this.selectedUserIds.length; x++) {
        this.selectedUserIds.shift();
      }
    },
    disableUsers() {
      for (let x = 0; x < this.selectedUserIds.length; x++) {
        let idToMatch = this.selectedUserIds[x];
        this.users.forEach((user) => {
          if (user.id == idToMatch) {
            user.status = 'Disabled';
          }
        });
      }
      // Empty selectedUserIds[] array.
      for (let x = 0; x < this.selectedUserIds.length; x++) {
        this.selectedUserIds.shift();
      }
    },
    deleteUsers() {
      console.log('Deleting Selected Users!');

      let tempUsers = this.users;
      tempUsers = tempUsers.filter((user) => {
        for (let i = 0; i < this.selectedUserIds.length; i++) {
          if (user.id == this.selectedUserIds[i]) {
            //this.selectedUsersIds.shift();
            return false; 
          }
        }
        return true;
      });
      this.users = tempUsers;
    },
    xdeleteUsers() {
      console.log('Deleting Selected Users!');

      let tempUsers = this.users;
      tempUsers = tempUsers.filter((u) => {
        for (let i = 0; i < this.selectedUserIds.length; i++) {
          if (u.id == this.selectedUserIds[i]) {
            this.selectedUsersIds.shift();
            return false; 
          }
        }
        return true;
      });
      this.users = tempUsers;
    }
  },
  computed: {
    filteredList() {
      let filteredUsers = this.users;
      if (this.filter.firstName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.firstName
            .toLowerCase()
            .includes(this.filter.firstName.toLowerCase())
        );
      }
      if (this.filter.lastName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.lastName
            .toLowerCase()
            .includes(this.filter.lastName.toLowerCase())
        );
      }
      if (this.filter.username != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.username
            .toLowerCase()
            .includes(this.filter.username.toLowerCase())
        );
      }
      if (this.filter.emailAddress != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.emailAddress
            .toLowerCase()
            .includes(this.filter.emailAddress.toLowerCase())
        );
      }
      if (this.filter.status != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.status === this.filter.status
        );
      }
      return filteredUsers;
    },
    actionButtonsDisabled() {
      let actionButtons = this.showActionButtons;
      if (this.selectedUserIds.length === 0) {
        actionButtons = true;
      } else {
        actionButtons = false;
      }
      return actionButtons;
    }
    //toggleCheckBox() {
      //let userIds = this.selectedUserIds;
      //let chkbx = this.myCheckBox;
      //userIds.unshift(this.id);
      //chkbx = true;
      //console.log(this.id);
      //return chkbx;
    //}
  }
};
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
  margin-bottom: 20px;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input,
select {
  font-size: 16px;
}

form {
  margin: 20px;
  width: 350px;
}
.field {
  padding: 10px 0px;
}
label {
  width: 140px;
  display: inline-block;
}
button {
  margin-right: 5px;
}
.all-actions {
  margin-bottom: 40px;
}
.btn.save {
  margin: 20px;
  float: right;
}
</style>
