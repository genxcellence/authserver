import React, { Component } from "react";
import { connect } from "react-redux";
import { Route } from "react-router";
import "./app-router.scss";
import { BrowserRouter as Router } from 'react-router-dom';
import {
  LOGOUT_PAGE_URI
} from "client/constant";
import { Header, Footer, MainComponent, Logout } from "client/components";
import { Dispatch } from "redux";

export interface AppRouterProps {
  dispatch: Dispatch;
}

class AppRouter extends Component<AppRouterProps> {
  render() {
    return (
      <Router>
        <Header />
        <div className="app-body">
          <Route path="/" component={MainComponent} />
          <Route exact path={LOGOUT_PAGE_URI} component={Logout} />
        </div>
        <Footer
        />
      </Router>
    );
  }
}

const mapStateToProps = (state) => {
  return {
  };
};

export default connect(mapStateToProps)(AppRouter);
