import React, { useState, useEffect } from "react";
import { Link, useParams } from "react-router-dom";
import axios from "axios";
import Layout from "../components/Layout";

function MenusettingView() {
  const [id, setId] = useState(useParams().id);
  const [menusetting, setMenusetting] = useState({
    menucode: "",
    menuname: "",
  });

  useEffect(() => {
    axios
      .get(`http://localhost:8080/menu-setting/${id}`)
      .then(function (response) {
        setMenusetting(response.data);
      })
      .catch(function (error) {
        console.log(error);
      });
  }, []);

  return (
    <Layout>
      <div className="container" style={{ backgroundColor: "#cccdc9" }}>
        <h2 className="text-center mt-5 mb-3">Show Menu setting details</h2>
        <div className="card">
          <div className="card-header">
            <Link className="btn btn-outline-info float-right" to="/home">
              {" "}
              View All details
            </Link>
          </div>
          <div className="card-body">
            <b className="text-muted">Menu Code:</b>
            <p>{menusetting.menucode}</p>
            <b className="text-muted">Menu name:</b>
            <p>{menusetting.menuname}</p>
          </div>
        </div>
      </div>
    </Layout>
  );
}

export default MenusettingView;
