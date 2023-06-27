import React, { Component } from "react";
import { Routes, Route, Link } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import AuthService from "./services/auth.service";

import Login from "./components/login.component";

import Home from "./components/home";

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

import axios from "axios";
import Swal from "sweetalert2";

import EventBus from "./common/EventBus";
const user = JSON.parse(localStorage.getItem("user"));
if (user) {
}

class App extends Component {
  constructor(props) {
    super(props);
    this.logOut = this.logOut.bind(this);

    this.state = {
      currentUser: undefined,
    };
  }

  componentDidMount() {
    const user = AuthService.getCurrentUser();

    if (user) {
      this.setState({
        currentUser: user,
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
          </Routes>
        </div>
      </div>
    );
  }
}

export default App;
