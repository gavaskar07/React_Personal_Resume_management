import React from "react";
import { Link } from "react-router-dom";

function Home() {
  // Function to handle logout
  const handleLogout = () => {
    // Perform logout logic here
    // Example: Clearing user session, redirecting to login page, etc.
  };

  return (
    <div
      className="container-fluid min-vh-100 py-5"
      style={{ backgroundColor: "#cccdc9" }}
    >
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <div className="container">
          <button
            className="navbar-toggler"
            type="button"
            data-toggle="collapse"
            data-target="#navbarNav"
            aria-controls="navbarNav"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <p style={{ fontFamily: "Arial, sans-serif" }}>
            Unleash Your Potential: Seamlessly Manage and Showcase Your
            Professional Journey
          </p>
          <div className="collapse navbar-collapse" id="navbarNav">
            <ul className="navbar-nav ml-auto">
              <li className="nav-item">
                <Link to="/" className="btn btn-outline-secondary">
                  Logout
                </Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <div
        className="row justify-content-center align-items-center h-100"
        style={{ backgroundColor: "#d6e0d5" }}
      >
        <div className="col-lg-6">
          <div className="card shadow">
            <div className="card-body">
              <h1 className="text-center mb-4">
                Personal Resume Management System
              </h1>
              <div className="row">
                <div className="col-6 mb-3">
                  <Link to="/menusettingretrive" className=" btn btn-secondary">
                    Menu Setting
                  </Link>
                </div>
                <div className="col-6 mb-3">
                  <Link
                    to="/prs_coresprofobjretrive"
                    className="btn btn-secondary"
                  >
                    Correspondence Profile Setting
                  </Link>
                </div>
                <div className="col-6 mb-3">
                  <Link
                    to="/prs_educationretrive"
                    className="btn btn-secondary"
                  >
                    Education Detail Setting
                  </Link>
                </div>
                <div className="col-6 mb-3">
                  <Link
                    to="/prs_experienceretrive"
                    className="btn btn-secondary"
                  >
                    Experience Details Setting
                  </Link>
                </div>
                <div className="col-6 mb-3">
                  <Link to="/prs_projectretrive" className="btn btn-secondary">
                    Project Details Setting
                  </Link>
                </div>
                <div className="col-6 mb-3">
                  <Link
                    to="/prs_technicalretrive"
                    className="btn btn-secondary"
                  >
                    Technical Details Setting
                  </Link>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Home;
