import React, { Component } from "react";
import { Routes, Route, Link } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import AuthService from "./services/auth.service";

import Login from "./components/login.component";
import Register from "./components/register.component";

import Home from "./components/home";
// import Profile from "./components/profile.component";
import BoardUser from "./components/board-user.component";
import BoardModerator from "./components/board-moderator.component";
import BoardAdmin from "./components/board-admin.component";
import UsersettingCreate from "./pages/UsersettingCreate";
import UsersettingEdit from "./pages/UsersettingEdit";
import UsersettingView from "./pages/UsersettingView";
import UsersettingRetrive from "./pages/UsersettingRetrive";
import MenusettingRetrive from "./pages/MenusettingRetrive";
import MenusettingCreate from "./pages/MenusettingCreate";
import MenusettingEdit from "./pages/MenusettingEdit";
import MenusettingView from "./pages/MenusettingView";
import Prs_coresprofobjRetrive from "./pages/Prs_coresprofobjRetrive";
import Prs_coresprofobjCreate from "./pages/Prs_coresprofobjCreate";
import Prs_coresprofobjEdit from "./pages/Prs_coresprofobjEdit";
import Prs_coresprofobjView from "./pages/Prs_coresprofobjView";
import Prs_educationRetrive from "./pages/Prs_educationRetrive";
import Prs_educationCreate from "./pages/Prs_educationCreate";
import Prs_educationEdit from "./pages/Prs_educationEdit";
import Prs_educationView from "./pages/Prs_educationView";
import Prs_experienceRetrive from "./pages/Prs_experienceRetrive";
import Prs_experienceCreate from "./pages/Prs_experienceCreate";
import Prs_experienceEdit from "./pages/Prs_experienceEdit";
import Prs_experienceView from "./pages/Prs_experienceView";
import Prs_projectRetrive from "./pages/Prs_projectRetrive";
import Prs_projectCreate from "./pages/Prs_projectCreate";
import Prs_projectEdit from "./pages/Prs_projectEdit";
import Prs_projectView from "./pages/Prs_projectView";
import Prs_technicalRetrive from "./pages/Prs_technicalRetrive";
import Prs_technicalCreate from "./pages/Prs_technicalCreate";
import Prs_technicalEdit from "./pages/Prs_technicalEdit";
import Prs_technicalView from "./pages/Prs_technicalView";
import SubmenusettingRetrive from "./pages/SubmenusettingRetrive";
import SubmenusettingCreate from "./pages/SubmenusettingCreate";
import SubmenusettingEdit from "./pages/SubmenusettingEdit";
import SubmenusettingView from "./pages/SubmenusettingView";
import axios from "axios";
import Swal from "sweetalert2";
// import AuthVerify from "./common/auth-verify";

import EventBus from "./common/EventBus";
const user = JSON.parse(localStorage.getItem("user"));

//axios.defaults.headers.common.Authorization = "Bearer " + user.accessToken;
//axios.defaults.baseURL = "http://localhost:8000/api/";
if (user) {
 // axios.defaults.headers.common["Authorization"] = "Bearer " + user.accessToken;
  //axios.defaults.headers.common.Authorization = "Bearer " + user.accessToken;
 // Swal.fire({
   // icon: "error",
    //title: user.accessToken,
   // showConfirmButton: false,
   // timer: 1500,
 // });
}

class App extends Component {
  constructor(props) {
    super(props);
    this.logOut = this.logOut.bind(this);

    this.state = {
      // showModeratorBoard: false,
      // showAdminBoard: false,
      currentUser: undefined,
    };
  }

  componentDidMount() {
    const user = AuthService.getCurrentUser();

    if (user) {
      this.setState({
        currentUser: user,
        //showModeratorBoard: user.roles.includes("ROLE_MODERATOR"),
        //showAdminBoard: user.roles.includes("ROLE_ADMIN"),
      });
    }

    EventBus.on("logout", () => {
      this.logOut();
    });
  }

  componentWillUnmount() {
    EventBus.remove("logout");
  }

  logOut() {
    AuthService.logout();
    this.setState({
      //showModeratorBoard: false,
      //showAdminBoard: false,
      currentUser: undefined,
    });
  }

  render() {
    const { currentUser, showModeratorBoard, showAdminBoard } = this.state;

    return (
      <div>
        <div className="container mt-3">
          <Routes>
            <Route path="/" element={<Login />} />
            <Route path="/home" element={<Home />} />
            <Route path="/login" element={<Login />} />
            <Route path="/register" element={<Register />} />
            {/* <Route path="/profile" element={<Profile />} /> */}
            <Route path="/user" element={<BoardUser />} />
            <Route path="/mod" element={<BoardModerator />} />
            <Route path="/admin" element={<BoardAdmin />} />
            <Route
              exact
              path="/usersettingretrive"
              element={<UsersettingRetrive />}
            />
            <Route path="/usersettingcreate" element={<UsersettingCreate />} />
            <Route path="/usersettingedit/:id" element={<UsersettingEdit />} />
            <Route path="/usersettingview/:id" element={<UsersettingView />} />
            <Route
              exact
              path="/menusettingretrive"
              element={<MenusettingRetrive />}
            />
            <Route path="/menusettingcreate" element={<MenusettingCreate />} />
            <Route path="/menusettingedit/:id" element={<MenusettingEdit />} />
            <Route path="/menusettingview/:id" element={<MenusettingView />} />
            <Route
              exact
              path="/prs_coresprofobjretrive"
              element={<Prs_coresprofobjRetrive />}
            />
            <Route
              path="/prs_coresprofobjcreate"
              element={<Prs_coresprofobjCreate />}
            />
            <Route
              path="/prs_coresprofobjedit/:id"
              element={<Prs_coresprofobjEdit />}
            />
            <Route
              path="/prs_coresprofobjview/:id"
              element={<Prs_coresprofobjView />}
            />
            <Route
              exact
              path="/prs_educationretrive"
              element={<Prs_educationRetrive />}
            />
            <Route
              path="/prs_educationcreate"
              element={<Prs_educationCreate />}
            />
            <Route path="/prs_educationedit" element={<Prs_educationEdit />} />
            <Route path="/prs_educationview" element={<Prs_educationView />} />
            <Route
              exact
              path="/prs_experienceretrive"
              element={<Prs_experienceRetrive />}
            />
            <Route
              path="/prs_experiencecreate"
              element={<Prs_experienceCreate />}
            />
            <Route
              path="/prs_experienceedit"
              element={<Prs_experienceEdit />}
            />
            <Route
              path="/prs_experienceview"
              element={<Prs_experienceView />}
            />
            <Route
              exact
              path="/prs_projectretrive"
              element={<Prs_projectRetrive />}
            />
            <Route path="/prs_projectcreate" element={<Prs_projectCreate />} />
            <Route path="/prs_projectedit/:id" element={<Prs_projectEdit />} />
            <Route path="/prs_projectview/:id" element={<Prs_projectView />} />
            <Route
              exact
              path="/prs_technicalretrive"
              element={<Prs_technicalRetrive />}
            />
            <Route
              path="/prs_technicalcreate"
              element={<Prs_technicalCreate />}
            />
            <Route
              path="/prs_technicaledit/:id"
              element={<Prs_technicalEdit />}
            />
            <Route
              path="/prs_technicalview/:id"
              element={<Prs_technicalView />}
            />
            <Route
              exact
              path="/submenusettingretrive"
              element={<SubmenusettingRetrive />}
            />
            <Route
              path="/submenusettingcreate"
              element={<SubmenusettingCreate />}
            />
            <Route
              path="/submenusettingedit/:id"
              element={<SubmenusettingEdit />}
            />
            <Route
              path="/submenusettingview/:id"
              element={<SubmenusettingView />}
            />
          </Routes>
        </div>

        {/* <AuthVerify logOut={this.logOut}/> */}
      </div>
    );
  }
}

export default App;
