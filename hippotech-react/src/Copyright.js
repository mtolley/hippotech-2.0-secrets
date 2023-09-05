import { Typography, Link } from "@mui/material";

export default function Copyright() {
  return (
    <Typography variant="body1" color="text.primary" align="center">
      {'Send questions, comments, and deeply held grievances to '}
      <Link color="inherit" href="mailto://mtolley@synopsys.com">
        mtolley@synopsys.com
      </Link>
    </Typography>
  );
}